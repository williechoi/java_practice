class Person {
    String name;
    String job;

    public Person() {}
    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String toString() {
        return name + ", " + job;
    }
}


public class SerializationTest {
    public static void main(String[] args) {
        Person LeeJunghoo = new Person("이정후", "야구선수");
        Person SonHeungmin = new Person("손흥민", "축구선수");

        try (FileOutputStream fos = new FileOutputStream("serial.txt");
                ObjectOutputStream ois = new ObjectOutputStream(fos)){

            ois.writeObject(LeeJunghoo);
            ois.writeObject(SonHeungmin);



        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fos = new FileInputStream("serial.txt");
                ObjectInputStream ois = new ObjectInputStream(fos)){

            Person lee = (Person) ois.readObject();
            Person son = (Person) oid.readObject();
            ois.writeObject(SonHeungmin);

            System.out.println(lee);
            System.out.println(son);

        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }



    }
}