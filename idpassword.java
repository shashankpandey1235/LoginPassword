import java.util.HashMap;

public class idpassword {

    HashMap<String,String> logininfo = new HashMap<String,String>();

    idpassword(){
        logininfo.put("aryan","13579");
        logininfo.put("Naruto","Hinata");
        logininfo.put("Itachi","Power");

    }
    protected  HashMap getInfo(){
        return logininfo;
    }


}
