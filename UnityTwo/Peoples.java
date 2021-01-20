package UnityTwo;

public class Peoples extends People {
    public static void main(String[] args) {
        People pessoa = new People();
        System.out.println("-----First constructor with 4 params-----");
        pessoa.People("Marco Antônio de Souza", 18, "homem", 1.80);
        pessoa.status();
        System.out.println("----Changing the class atributes with methods-------");
        // commit - ading the getters and setters
        /* changing with methods the atributes from "pessoa" object */

        pessoa.setName("Marcos");
        pessoa.setAge(28);
        pessoa.setHeight(1.50f);
        pessoa.setGender(null);
        System.out.println(pessoa.getName());
        System.out.println(pessoa.getAge());
        System.out.println(pessoa.getGender());
        System.out.println(pessoa.getHeight());

        System.out.println("-----Constructor with 2 params------");
        People maria = new People();
        maria.People("mariana", 32);
        maria.status();

    }
}
