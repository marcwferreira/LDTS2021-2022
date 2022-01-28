public class StringInverter implements StringTransformer{

    public void execute(StringDrink drink) {
        String toInvert = drink.getText();
        toInvert = new StringBuilder(toInvert).reverse().toString();
        drink.setText(toInvert);
    }

}
