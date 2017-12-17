package idv.workshop.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductTest {

    @Test
    public void testCreate() {
        final Long idOfComic = Long.valueOf(001);
        final String nameOfComic = "comic";
        final Integer priceOfComic = 729;
        final Integer quantityOfComic = 20;

        Product comic = new Product(idOfComic, nameOfComic, priceOfComic, quantityOfComic);

        assertEquals(idOfComic, Long.valueOf(comic.getId()));
        assertEquals(nameOfComic, comic.getName());
        assertEquals(priceOfComic, comic.getPrice());
        assertEquals(quantityOfComic, comic.getQuantity());

        final Long idOfNovel = Long.valueOf(002);
        final String nameOfNovel = "novel";
        final Integer priceOfNovel = 540;
        final Integer quantityOfNovel = 10;

        Product novel = new Product(idOfNovel, nameOfNovel, priceOfNovel, quantityOfNovel);

        assertEquals(idOfNovel, Long.valueOf(002));
        assertEquals(nameOfNovel, novel.getName());
        assertEquals(priceOfNovel, novel.getPrice());
        assertEquals(quantityOfNovel, novel.getQuantity());
    }
}
