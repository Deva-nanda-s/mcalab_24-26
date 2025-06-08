
class Zoo{
       String name;
       String[] encl;

       public Zoo(String name,String[] encl)
      {
        this.name=name;
        this.encl =encl;
       }

       public void dis1(){
        System.out.println("Name:"+name);

        for(String x:encl){
            System.out.println(x);
        }
       }

       class Enclosure{
        String name,type;
        String[] an;

        public Enclosure( String name,String type,String[] an){

        this.name=name;
        this.type=type;
        this.an =an;
       }

       public void dis2(){
        System.out.println("Name:\n"+name+"Type:"+type);

        for(String x:an){
            System.out.println(x);
        }
    }
       }

    static class ZooInfo{
        String add;
        String phno;

        public ZooInfo(String add,String phno){
        this.add=add;
        this.phno=phno;
    }
        public void dis3(){
            System.out.println("Address:\n"+add+"Phno:"+phno);
    }
}
}

class ZooDemo{
    public static void main(String[] args){
        String enclosure[]={"A1","A2","A3"};
        String an[]={"z","r"};
        Zoo z=new Zoo("shj",enclosure);
        Zoo.Enclosure en=z.new Enclosure("a","d",an);
        Zoo.ZooInfo info=new Zoo.ZooInfo("d","6554");
        z.dis1();
        en.dis2();
        info.dis3();
       
    }
}


// import java.util.Scanner;
// class Zoo{
//        String name;
//        String[] encl;

//        public Zoo(Scanner sc){
//         System.out.println("Enter name:");
//         this.name=sc.nextLine();
//         System.out.println("Enter enclosures (comma-separated):");
//         String enclosureInput = sc.nextLine();
//         this.encl = enclosureInput.split(",\\s*");
//        }

//        public void dis1(){
//         System.out.println("Name:"+name);

//         for(String x:encl){
//             System.out.println(x);
//         }
//        }

//        class Enclosure{
//         String name,type;
//         String[] an;

//         public Enclosure(Scanner sc){

//         System.out.println("Enter name:");
//         this.name=sc.nextLine();

//         System.out.println("Enter type:");
//         this.type=sc.nextLine();

//         System.out.println("Enter animal list (comma-separated):");
//         String animalInput = sc.nextLine();
//         this.an = animalInput.split(",\\s*");
//        }

//        public void dis2(){
//         System.out.println("Name:\n"+name+"Type:"+type);

//         for(String x:an){
//             System.out.println(x);
//         }
//     }
//        }

//     static class ZooInfo{
//         String add;
//         String phno;

//         public ZooInfo(Scanner sc){
//         System.out.println("Enter address:");
//         this.add=sc.nextLine();
//         System.out.println("Enter phno:");
//         this.phno=sc.nextLine();
//     }
//         public void dis3(){
//             System.out.println("Address:\n"+add+"Phno:"+phno);
//     }
// }
// }

// class ZooDemo{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         Zoo z=new Zoo(sc);
//         Zoo.Enclosure en=z.new Enclosure(sc);
//         Zoo.ZooInfo info=new Zoo.ZooInfo(sc);
//         z.dis1();
//         en.dis2();
//         info.dis3();
//         sc.close();
//     }
// }

