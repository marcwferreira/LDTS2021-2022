import java.util.List;

public class StringRecipe {
    List<StringTransformer> steps;

    public StringRecipe(List<StringTransformer> step){
        this.steps = step;
    }

    public void mix(StringDrink drink){
        for (StringTransformer i: steps) {
            i.execute(drink);
        }
    }

}
