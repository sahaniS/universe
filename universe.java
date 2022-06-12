public class universe {
    private int humans;


    public universe(int humans){
        this.humans=humans;
    }
    public void canCook(){
        System.out.println("humans can cook");
    }
    public void canEat(){
        System.out.println("humans can eat");
    }
    public void canDrive(){
        System.out.println("humans can drive");
    }
    static class humans{
        private String gender;
        public void canMarry(String gender){
            this.gender=gender;
            if(this.gender=="male"||this.gender=="Male"){
                System.out.println("this human can marry to female only");
            }else{
                System.out.println("this human can marry to male only");
            }
        }
    }
}
