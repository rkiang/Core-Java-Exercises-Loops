public class ForLoopBreak {
    public static void main(String[] args){
        for(int i = 0; i < 100; i+=5){
            if(i > 50)
                break;
            System.out.println(i);
        }
    }
}
