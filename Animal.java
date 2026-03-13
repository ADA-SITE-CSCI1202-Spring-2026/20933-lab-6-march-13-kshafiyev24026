public class Animal {
    String animalName;
    String ownerName;
    int age;
    public Animal(String animalName,String ownerName,int age){
        this.animalName=animalName;
        this.ownerName=ownerName;
        setage(age);
    }
    public String getanimalName(){
        return animalName;
    }
    public void setanimalName(String animalName){
        this.animalName=animalName;

    }
    public String getownerName(){
        return ownerName;
    }
    public void setownerName(String ownerName){
        this.ownerName=ownerName;

    }public int getage(){
        return age;
    }
    public void setage(int age){
        if (age<0){
            throw new IllegalArgumentException("Age can not be negative!");
        }else{
        this.age=age;
        }
    }
    public String toString(){
        return "animalName:"+animalName+"   OwnerName:"+ownerName+"   age:"+age;

    }
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Animal)) {
            return false;
        }
        Animal p = (Animal) obj;
        if (animalName.equals(p.animalName) && ownerName.equals(p.ownerName) && age == p.age) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args){
            Animal mm=new Animal("khayal", "shafiyev", 12);
            Animal miri=new Animal("khayal", "shafiyev", 12);
            System.out.println(mm.equals(miri));
    }
}
