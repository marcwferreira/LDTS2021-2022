public class StringReplacer implements StringTransformer{

    char replaced;
    char replacer;

    public StringReplacer(char a, char b){
        this.replaced = a;
        this.replacer = b;
    }


    public void execute(StringDrink drink) {
        String text = drink.getText();
        text = text.replace(replaced,replacer);
        drink.setText(text);
    }
}
