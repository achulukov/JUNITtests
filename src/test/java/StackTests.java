import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;

public class StackTests {
    Stack stack = new Stack();

    @Test
    public void testPop() {
        Integer expected = 5;

        stack.push(5);
        Integer result = Integer.parseInt(stack.pop());

        assertThat(expected, equalTo(result));
    }

    @Test
    public void testIsNode() {

        stack.push(5);
        Node head = stack.getHead();

        assertThat(head, isA(Node.class));
    }




}
