public class Main {

    DBModule dbModule;

    public Main(DBModule module){
        this.dbModule = module;
    }

    public String main() {

        String [] data = dbModule.getData();

        String result = "";

        if(data.length == 2){
            result = "Salam " + data[0] + " " + data[1] + ".";
        } else if (data.length == 1) {
            result = "Salam " + data[0] + ".";
        } else if (data.length == 0){
            result = "Salam .";
        }


        return  result;

    }

}
