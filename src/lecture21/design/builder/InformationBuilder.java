package lecture21.design.builder;

/**
 * @author yslabko
 */
public class InformationBuilder {

    private Gender gender;
    private String name;
    private Season season;
    private Substance substance;

    public InformationBuilder(Gender gender) {
        this.gender = gender;
    }

    public InformationBuilder name(String name) {
        this.name = name;
        return this;
    }

    public InformationBuilder season(Season season) {
        this.season = season;
        return this;
    }

    public InformationBuilder substance(Substance substance) {
        this.substance = substance;
        return this;
    }

    public String build() {
        String result = gender.getInformation();
        result += name == null ? " without name" : " by name " + name;
        result += season == null ? " born in space" : " born in season" + season.getInformation();
        result += substance == null ? " and without substance" : " under " + substance.getInformation() + " substance.";
        return result;
    }
}
