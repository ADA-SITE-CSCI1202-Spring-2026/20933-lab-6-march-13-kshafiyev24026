public class Dog extends Animal {
    String breed;
   public Dog(String breed,String animalName,String ownerName,int age ){
    super(animalName, ownerName, age);
    this.breed=breed;

   }
   public String getBreed(){
    return breed;

   }
   public void setBreed(String breed){
    this.breed=breed;
   }
   public String toString(){
    return super.toString()+"   Breed:"+breed;
   }
    public boolean equals(Object obj){
        if(obj==null){
            return false;
        }
        if(!(obj instanceof Dog)){
            return false;
        }
        Dog p=  (Dog) obj;
        if(super.equals(p)&&breed.equals(p.breed)){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
            Animal mm=new Dog("wolf","khayal", "shafiyev", 12);
            Animal miri=new Dog("wolf","khayal", "shafiyev", 12);
            System.out.println(mm.equals(miri));

}
}
