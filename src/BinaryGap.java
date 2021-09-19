public class BinaryGap {
    public int solution(int N) {
        String zeki = Integer.toBinaryString(N);
        int counter = 0;
        int maxCount = 0;
        boolean started = false;
        for (int i = 0; i < zeki.length(); i++) {
            String c = zeki.substring(i, i + 1);
            if (c.equals("1")) {
                if (started) {
                    if (counter > maxCount) {
                        maxCount = counter;
                    }
                }
                counter = 0;
                started=true;
            }

            if (c.equals("0")){
                counter++;
            }
        }
        return maxCount;
    }
    public static void main(String[] args){
        BinaryGap binaryGap = new BinaryGap();
        System.out.println(binaryGap.solution(529));
    }

}
