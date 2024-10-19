package mx.examples.financials.domain.use_case.detail;

import mx.examples.financials.domain.entity.FinancialInstitution;

import java.util.Optional;

public class FinancialInstitutionGetUseCase {

    public Optional<FinancialInstitution> execute(Long id) {
        return Optional.of(
                new FinancialInstitution(
                        id,
                        "::name-fake::",
                        "::type-fake::"
                )
        );
    }
}
