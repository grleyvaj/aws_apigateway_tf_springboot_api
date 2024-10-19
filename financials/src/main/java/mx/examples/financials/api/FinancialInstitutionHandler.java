package mx.examples.financials.api;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import mx.examples.financials.api.create.request.Request;
import mx.examples.financials.api.create.response.FinancialInstitutionCreateResponse;

public class FinancialInstitutionHandler implements RequestHandler<Request, FinancialInstitutionCreateResponse> {


    public FinancialInstitutionHandler() {
    }

    @Override
    public FinancialInstitutionCreateResponse handleRequest(
            Request request,
            Context context
    ) {
        context.getLogger().log("Request: " + request.getName());
        FinancialInstitutionCreateResponse response = new FinancialInstitutionCreateResponse(request.getName());
        context.getLogger().log("Response: " + response.getName());
        return response;
    }

}
