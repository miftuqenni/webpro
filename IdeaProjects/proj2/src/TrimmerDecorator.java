public class TrimmerDecorator extends Decorator {
    public TrimmerDecorator(Nameable nameable) {
        super(nameable);
    }

    @Override
    public String getCorrectName() {
        String name = nameable.getCorrectName();
        if (name.length() > 10) {
            return name.substring(0, 10);
        }
        return name;
    }
}