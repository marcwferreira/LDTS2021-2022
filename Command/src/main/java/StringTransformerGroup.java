import java.util.List;

public class StringTransformerGroup implements StringTransformer{

    List<StringTransformer> steps;

    public StringTransformerGroup(List<StringTransformer> step){
        this.steps = step;
    }

    public void execute(StringDrink drink) {
        for (StringTransformer i: steps) {
            i.execute(drink);
        }
    }
}
