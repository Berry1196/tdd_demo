package Facade;

public class Hello {
    public String sayHello(String[] name) {

        if(name == null) {
            return "Hello my friend";
        }
        if(name[0] == name[0].toUpperCase()) {
            return "HELLO " + name[0];
        }
        if(name.length == 2) {
            return "Hello " + name[0] + " and " + name[1];
        } else if (name.length > 2) {
            String[] namesList = new String[name.length];
            for (int i = 0; i < name.length; i++) {
                namesList[i] = name[i];
            }
            String last = namesList[namesList.length - 1];
            namesList[namesList.length - 1] = "and " + last;
            return "Hello " + String.join(", ", namesList);
        }

        return "Hello " + name[0];
    }

}
