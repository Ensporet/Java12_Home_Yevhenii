public class Summer {


    public Summer(){};
    public Summer(String s){this.setText(s);}


private String text ;
public String getText(){

    if(text == null)
        return "Никак !" ;

        return text;
}
public boolean setText(String Text){text = Text; return  true;}


public void PrintHistori(){

    String  StartText = "Лето 2017 года я провел так ...";
    String  FinText = "The end.";

    System.out.println(StartText);
    System.out.println(this.getText());
    System.out.println(FinText);

return;
}



}
