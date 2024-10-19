package mx.examples.financials.domain.entity;

public class FinancialInstitution {
    private final Long id;
    private final String name;
    private final String type;

    public FinancialInstitution(Long id, String name, String type) {
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
