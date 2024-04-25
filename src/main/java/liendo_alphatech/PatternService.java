package liendo_alphatech;

import lombok.NoArgsConstructor;

import java.util.Objects;

@NoArgsConstructor
public class PatternService {

    public String generatePattern(Integer pl) {

        // Generate a StringBuilder with capacity calculated through pl.
        StringBuilder sb = new StringBuilder((pl * 2) * ((pl * 2) + 1));

        //First row
        sb.append('A');
        sb.append(this.repeat(' ', ((pl * 2) - 2)));
        sb.append("A\n");
        //second row to (pl)th row
        for (int i = 2; i <= pl; i++) {
            sb.append('A');                                 //A's column
            sb.append(this.repeat(' ', (i - 2)));    // triangle filled with ' '
            sb.append((char) (64 + i));                     // B-C-D-E slope
            sb.append(this.repeat(' ', ((pl - i) * 2))); //second triangle
            sb.append('A');                                 // A-A-A-A slope
            sb.append(this.repeat(' ', (i - 2)));    // triangle filled with ' '
            sb.append((char) (64 + i));                     // B-C-D-E slope
            sb.append('\n');                                // end of row
        }
        for (int i = (pl); i >= 2; i--) {
            sb.append('A');                                 //A's column
            sb.append(this.repeat(' ', (i - 2)));    // triangle filled with ' '
            sb.append((char) (64 + i));                     // B-C-D-E slope
            sb.append(this.repeat(' ', ((pl - i) * 2))); //second triangle
            sb.append('A');                                 // A-A-A-A slope
            sb.append(this.repeat(' ', (i - 2)));    // triangle filled with ' '
            sb.append((char) (64 + i));                     // B-C-D-E slope
            sb.append('\n');                                // end of row
        }
        //
        sb.append('A');
        sb.append(this.repeat(' ', ((pl * 2) - 2)));
        sb.append("A\n");

        return sb.toString();
    }

    private String repeat(char ch, int num){
        return new String(new char[num]).replace('\u0000', ch);

    }
}
