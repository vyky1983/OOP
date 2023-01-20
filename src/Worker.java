public class Worker {
    String name;
    String  post;
    double salary;

    Worker(String name, String post, double salary){
        this.name=name;
        this.post=post;
        this.salary=salary;
    }

    String getWorker(){
        return "Name --> "+name+"\nPost --> "+post+"\nSalary --> "+salary+" "+"rub.";
    }

    void showInfo(){
        System.out.println(getWorker());
    }
}
