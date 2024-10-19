package mx.examples.financials.domain.use_case.create;

public class FinancialInstitutionCreateInput {

    private final Long id;
    private final String name;
    private final String type;

    public FinancialInstitutionCreateInput(Long id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
