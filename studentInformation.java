import java.util.*;

class StudentInformation
{
  String name;
  public void setName(String name)
  {
    this.name=name;
  }
  public String getName()
  {
    return this.name;
  }
  String fatherName;
  public void setFatherName(String fatherName)
  {
    this.fatherName=fatherName;
  }
  public String getFatherName()
  {
    return this.fatherName;
  }
  String rollNumber;
  public void setRollNo(String rollNo)
  {
    this.rollNumber=rollNo;
  }
  public String getRollNo()
  {
    return this.rollNumber;
  }
  String mobileNumber;
  public void setMobileNumber(String mobileNumber)
  {
    this.mobileNumber=mobileNumber;
  }
  public String getMobileNumber()
  {
    return this.mobileNumber;
  }
}
class StudentResult extends StudentInformation
{
  int physics;
  public void setPhysicsMarks(int physics)
  {
    if(physics>=0 && physics<=100){
    this.physics=physics;
    }
    else
    {
      System.out.println("Wrong Input");
    }

  }
  public int getPhysicsMarks()
  {
    return this.physics;
  }

  int mathematics;
  public void setMathematicsMarks(int mathematics)
  {
    if(mathematics >=0 && mathematics <= 100)
    this.mathematics=mathematics;
    else System.out.println("Wrong Input");
  }
  public int getMathematicsMarks()
  {
    return this.mathematics;
  }

  int chemistry;
  public void setChemistryMarks(int chemistry)
  {
    if(chemistry>=0&&chemistry<=100)
    this.chemistry=chemistry;
    else System.out.println("Wrong Input");
  }
  public int getChemistryMarks()
  {
    return this.chemistry;
  }

  int hindi;
  public void setHindiMarks(int hindi)
  {
    if(hindi>=0&&hindi<=100)
    this.hindi=hindi;
    else System.out.println("Wrong Input");
  }
  public int getHindiMarks()
  {
    return this.hindi;
  }

  int english;
  public void setEnglishMarks(int english)
  {
    if(english>=0 && english<=100)
    this.english=english;
    else System.out.println("Wrong Input");
  }
  public int getEnglishMarks()
  {
    return this.english;
  }
  public int total(int mathematics,int physics,int chemistry,int hindi,int english)
  {
    int total = mathematics+physics+chemistry+hindi+english;
    return total;
  }
}
class student
{
  public static void main(String gg[])
  {
    StudentResult si = new StudentResult();
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter Student Name : ");
    String str1=sc.next();
    si.setName(str1);

    System.out.print("Enter Student Father Name : ");
    String str2=sc.next();
    si.setFatherName(str2);

      System.out.println("..................Choose the Menu.................. ");
      System.out.println("Press 1 for Result- ");
      System.out.println("Press 2 for Edit ");
      System.out.println("Press 3 for Delete ");
      System.out.println("press 4 for Update ");
      System.out.println("Press 5 for Show Result");
      int pera=sc.nextInt();

      if(pera==1)
      {

      System.out.print("Enter Physics Marks- ");
      int p=sc.nextInt();
      si.setPhysicsMarks(p);

      System.out.print("Enter Chemistry Marks- ");
      int c=sc.nextInt();
      si.setChemistryMarks(c);

      System.out.print("Enter Mathematics Marks- ");
      int m=sc.nextInt();
      si.setMathematicsMarks(m);

      System.out.print("Enter  Hindi Marks- ");
      int h=sc.nextInt();
      si.setHindiMarks(h);

      System.out.print("Enter English Marks- ");
      int e=sc.nextInt();
      si.setEnglishMarks(e);
      
      int total=si.total(p,c,m,h,e);
      int per=total/5;
      System.out.println("Total is : " + total + "  Percentage is : "+per);
    }    //System.in is a standard input stream
    else
    {
      System.out.println("Wrong OutPut");
    }

  }
}
