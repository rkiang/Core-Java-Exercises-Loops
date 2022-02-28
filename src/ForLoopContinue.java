public class ForLoopContinue {
    public static void main(String[] args){
        for(int i=0; i<=100; i+=5){
            if (i >= 25 && i<=75) {
                continue;
            }
            System.out.println(i);
        }
    }
}
