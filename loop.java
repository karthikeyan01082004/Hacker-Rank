public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        int sum;
        for(int k =1;k<=10;k++){
             sum=N*k;
            System.out.println(N+ " x " +k+ " = " +sum);
        }

        bufferedReader.close();
    }
}
