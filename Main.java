import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner Input=new Scanner(System.in);
    String userName="Patika", password="Myjava", control, new_password;

    System.out.println("Enter your username:");
    userName = Input.nextLine();

    System.out.println("Enter your password:");
    password = Input.nextLine();

    if (userName.equals("Patika") && password.equals("Myjava")){
        System.out.print("successfully logged in:");
    }
    else if (!userName.equals("Patika") || !password.equals("Myjava")){
        System.out.println("you wrongly entered username or password by entering new one now:");
        new_password=Input.nextLine();
        System.out.println("you password has been changed:");
        if (!new_password.equals(password)){
            System.out.print("you cant change your new password only if this should not be as same previous one:");
            new_password=Input.nextLine();
        }else if (new_password.equals(password)){

        }else {
        System.out.print("you can not reset your password");
    }
    }
}}






//Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak
//isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip,
//şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu"
//yazan programı yazınız.