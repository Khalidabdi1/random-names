public class random_names{
  static void name(String name1,String name2,String name3){
  String [] names ={name1,name2,name3};
  int max =2;
  int min =0;
  int range=max-min+1;
  int rangevalue=min+(int)(Math.random()*range);
  
  
  System.out.print(names[rangevalue]);
  
  
  }

  public static void main(String[] args) {
  name("khalid","abdi","kalib");

    
  }
}