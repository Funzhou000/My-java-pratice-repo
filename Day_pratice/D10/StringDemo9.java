package D10;

public class StringDemo9 {
    public static void main(String[] args) {
        String talk = "fuck you";
        String[] arr = { "suck dick", "fuck" };
        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i], "***");
        }
        System.out.println(talk);

    }
}
