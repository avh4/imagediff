package net.avh4.util.imagecomparison;

import org.junit.Before;
import org.junit.Test;

import static net.avh4.util.imagecomparison.ImageComparisonMatchers.isApproved;
import static org.hamcrest.MatcherAssert.assertThat;

public class ImageDiffViewTest {

    private ImageDiffView subject;

    @Before
    public void setUp() throws Exception {
        subject = new ImageDiffView("src/test/resources/expected.png",
                "src/test/resources/actual.png");
    }

    @Test
    public void testShowsHighlightInitially() throws Exception {
        assertThat(subject, isApproved());
    }

    @Test
    public void testTurnOffHighlight() throws Exception {
        subject.setShowHighlight(false);
        assertThat(subject, isApproved());
    }

}
