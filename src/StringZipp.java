public class StringZipp {

    public static void main(String[] args) {

        System.out.println("Input:"+args[0]);
        char[] allCharInArg = args[0].toCharArray();

        char prev = allCharInArg[0];
        int charCount = 1;
        StringBuilder zippedStr = new StringBuilder();
        for (int i = 1; i < allCharInArg.length; i++) {

            if(allCharInArg[i]==prev){
                charCount++;
            }else{
                zippedStr.append(prev).append(charCount>1?charCount:"");
                charCount =1;
            }

            prev = allCharInArg[i];

        }

        System.out.println(zippedStr);

    }
}
