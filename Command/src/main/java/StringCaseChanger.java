public class StringCaseChanger implements StringTransformer{
    public void execute(StringDrink drink) {
        String toSwap = drink.getText();
        char[] swaping = new char[toSwap.length()];
        for (int i=0; i < toSwap.length(); i++){
            char swap = toSwap.charAt(i);
            if (Character.isUpperCase(swap)){
                swap = Character.toLowerCase(swap);
                swaping[i] = swap;
            } else{
                swap = Character.toUpperCase(swap);
                swaping[i] = swap;
            }
        }
        drink.setText(new String(swaping));
    }
}
