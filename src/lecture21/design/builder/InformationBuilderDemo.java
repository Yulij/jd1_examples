package lecture21.design.builder;

/**
 * @author yslabko
 */
public class InformationBuilderDemo {

    public static void main(String[] args) {
        String description = new InformationBuilder(Gender.FEMALE)
                .build();
        System.out.println(description);
        System.out.println(new InformationBuilder(Gender.FEMALE)
                .name("Sofiya")
                .season(Season.SUMMER)
                .substance(Substance.EARTH)
                .build());
    }
}
