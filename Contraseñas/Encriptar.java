import java.util.Base64;

public class Encriptar{
    public static void main(String[] args){
        //Encriptar

        String miCosa = "123456";
        System.out.println(miCosa);



        String miCosaEncriptada = Base64.getEncoder().encodeToString(miCosa.getBytes());
        System.out.println(miCosaEncriptada);

        //Desencriptar

        byte[] bytesDecodificados = Base64.getDecoder().decode("MTExMTExMTExMQ==");
        String miCosaDesencriptada = new String(bytesDecodificados);
        System.out.println(miCosaDesencriptada);
    }
}