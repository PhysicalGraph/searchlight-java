import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.model.*;
import com.smartthings.searchlight.App;
import com.smartthings.searchlight.model.Bot;
import com.smartthings.searchlight.persistence.BotRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertTrue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

/**
 * Created by david on 11/7/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = App.class)
@WebAppConfiguration
@ActiveProfiles("local")
@TestPropertySource(properties = {
        "amazon.dynamodb.endpoint=http://localhost:8000/",
        "amazon.aws.accesskey=test1",
        "amazon.aws.secretkey=test231" })
public class BotRepositoryIntegrationTest {

    private DynamoDBMapper dynamoDBMapper;

    @Autowired
    private AmazonDynamoDB amazonDynamoDB;

    @Autowired
    BotRepository repository;

    private static final String EXPECTED_NAME = "NAME";

    @Before
    public void setup() throws Exception {
        //dynamoDBMapper = new DynamoDBMapper(amazonDynamoDB);

        //CreateTableRequest tableRequest = dynamoDBMapper.generateCreateTableRequest(Bot.class);
        //CreateTableRequest tableRequest = new CreateTableRequest()
        //        .withTableName("Bots")
        //        .withKeySchema(
        //                new KeySchemaElement("id", KeyType.HASH)
        //        )
        //        .withProvisionedThroughput(new ProvisionedThroughput(1L, 1L))
        //        .withAttributeDefinitions(
        //                new AttributeDefinition("id", "S")
        //        );




        //tableRequest.setProvisionedThroughput(
        //        new ProvisionedThroughput(1L, 1L));
        //amazonDynamoDB.createTable(tableRequest);

        //...

        //dynamoDBMapper.batchDelete(
        //        (List<Bot>)repository.findAll());
    }

    @Test
    public void sampleTestCase() {
        Bot bot = new Bot("NAME", "HOST", "1234", true, true);
        repository.save(bot);

        List<Bot> result  = (List<Bot>) repository.findAll();

        assertTrue("Not empty", result.size() > 0);
        assertTrue("Contains item with expected name",
                result.get(0).getMName().equals(EXPECTED_NAME));
    }
}
