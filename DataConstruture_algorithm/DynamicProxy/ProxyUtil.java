package DataConstruture_algorithm.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {


    public static Star createStar(BigStar bigStar){
        Star object = (Star)Proxy.newProxyInstance(
                bigStar.getClass().getClassLoader(),
                new Class[]{Star.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if("sing".equals(method.getName())){
                            System.out.println("before sing...");
                        }else if("dance".equals(method.getName())){
                            System.out.println("before dance...");
                        }
                        method.invoke(bigStar,args);
                        return null;
                    }
                }
        );

        return (Star) object;
    }
}

