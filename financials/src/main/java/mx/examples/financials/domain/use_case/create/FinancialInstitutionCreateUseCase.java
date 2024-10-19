package mx.examples.financials.domain.use_case.create;

import mx.examples.financials.domain.entity.FinancialInstitution;

public class FinancialInstitutionCreateUseCase {

    public FinancialInstitution execute(FinancialInstitutionCreateInput createInput) {
        return new FinancialInstitution(
                createInput.getId(),
                createInput.getName(),
                createInput.getType()
        );
    }

}
