import com.book.utils.ThymeleafUtil;
import org.junit.Test;
import org.thymeleaf.context.Context;

public class MainTest {
  @Test
    public void test() {
        Context context = new Context();
        ThymeleafUtil.process("login.html", context, null);
    }
}
