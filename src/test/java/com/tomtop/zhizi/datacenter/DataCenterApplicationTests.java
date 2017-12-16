package com.tomtop.zhizi.datacenter;

import com.tomtop.zhizi.datacenter.rabbitmq.Sender;
import org.elasticsearch.action.search.SearchResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DataCenterApplicationTests {
	@Autowired
	private Sender sender;


	@Test
	public void contextLoads() {
	    int i = 5000000;
	    while (i-- > 0){
            sender.send();
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
	}
	@Test
    public void esOperation(){
        ExpressTrackServiceTest t = new ExpressTrackServiceTest();
        t.deleteAll();
        t.saveExpressTrack();
        t.fetchAllExpressTracks();
        t.fetchIndividualExpressTrack();
    }


    @Test
    public void esQueryCount(){
        ExpressTrackServiceTest t = new ExpressTrackServiceTest();
        System.out.println(System.currentTimeMillis());
        t.count();
        System.out.println(System.currentTimeMillis());
    }

    @Autowired IndexService indexService;

    @Test
    public void s(){
        //System.setProperty("spring.profiles.active", "it");
        SearchResponse all = indexService.getAll();
        System.out.println(all.getTotalShards());
    }

}
