package guru.sfg.beer.service.services.inventory;

import java.util.UUID;

/**
 * Created by jt on 2019-06-07.
 */
public interface BeerInventoryService {

    Integer getOnHandInventory(UUID beerId);
}
