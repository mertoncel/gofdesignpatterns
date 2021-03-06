package structural.facade.hukuksal;

import java.util.List;

public class HukuksalKontrolService {

    private HukuksalSurecEntityService hukuksalSurecEntityService;

    public HukuksalKontrolService() {
        hukuksalSurecEntityService = new HukuksalSurecEntityService();
    }

    public boolean isHukuksalIslemde(Long borcId) {

        List<Long> hukuksalIslemdekiBorcList = hukuksalSurecEntityService.findAllHukuksalIslem();

        boolean isHukuksalIslemde = hukuksalIslemdekiBorcList.contains(borcId);

        if (isHukuksalIslemde) {
            System.out.printf("Borç hukuksal işşlemde. Tahsil edilemez");
        }

        return isHukuksalIslemde;
    }
}
