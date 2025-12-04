package DataConstruture_algorithm.searchAlgorithm;

public class blockSearch {
    public static void main(String[] args) {
        int[] arr = { 16, 5, 9, 12, 21, 18,
                32, 23, 37, 26, 45, 34,
                50, 48, 61, 52, 73, 66 };
        Block block1 = new Block(0, 5, 21);
        Block block2 = new Block(6, 11, 45);
        Block block3 = new Block(12, 17, 73);
        Block[] blocks = { block1, block2, block3 };
        System.out.println(blockSearchs(arr, blocks, 26));// 9

    }

    private static int blockSearchs(int[] arr, Block[] blocks, int i) {
        int blocIndex = findBlock(blocks, i);
        if (blocIndex == -1) {
            return -1;
        } else {
            int startIndex = blocks[blocIndex].getStartIndex();
            int endIndex = blocks[blocIndex].getEndIndex();
            for (int index = startIndex; index <= endIndex; index++) {
                if (i == arr[index]) {
                    return index;
                }
            }
        }
        return -1;
        // 找到所属块后，在块内进行查找

    }

    private static int findBlock(Block[] blocks, int i) {
        // 从 0 开始遍历 blockArr if I<=max return index
        for (int index = 0; index < blocks.length; index++) {
            if (i <= blocks[index].getMax()) {
                return index;
            }
        }
        return -1;
    }

    public static class Block {
        int[] blocks;
        int startIndex;
        int endIndex;
        int max;

        public Block(int startIndex, int endIndex, int max) {
            this.startIndex = startIndex;
            this.endIndex = endIndex;
            this.max = max;
        }

        public int[] getBlocks() {
            return blocks;
        }

        public void setBlocks(int[] blocks) {
            this.blocks = blocks;
        }

        public int getStartIndex() {
            return startIndex;
        }

        public void setStartIndex(int startIndex) {
            this.startIndex = startIndex;
        }

        public int getEndIndex() {
            return endIndex;
        }

        public void setEndIndex(int endIndex) {
            this.endIndex = endIndex;
        }

        public int getMax() {
            return max;
        }

        public void setMax(int max) {
            this.max = max;
        }

    }
}
