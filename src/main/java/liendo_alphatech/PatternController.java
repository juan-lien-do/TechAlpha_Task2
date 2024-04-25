package liendo_alphatech;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PatternController {
    private PatternIO pio;
    private PatternService ps;
    private Integer patternLength;
    private String finalText;

    public PatternController(){
        // set RDIO
        pio = new PatternIO(this);
        // set RDS
        ps = new PatternService();
        // start routine
        routine();
    }

    public void routine(){
        // call input output class and set
        pio.askPatternLength();
        // call service and set pattern
        this.finalText = ps.generatePattern(this.patternLength);
        // call input output class and show pattern
        pio.showPattern(this.finalText);
        // end of the use case
    }
}
