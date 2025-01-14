
package mage.game.permanent.token;

import mage.MageInt;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.keyword.CumulativeUpkeepAbility;
import mage.abilities.keyword.FlyingAbility;
import mage.constants.CardType;
import mage.constants.SubType;

/**
 * @author L_J
 */
public final class SplinterToken extends TokenImpl {

    public SplinterToken() {
        super("Splinter Token", "1/1 green Splinter creature token");
        cardType.add(CardType.CREATURE);
        subtype.add(SubType.SPLINTER);
        color.setGreen(true);
        power = new MageInt(1);
        toughness = new MageInt(1);
        this.addAbility(FlyingAbility.getInstance());
        this.addAbility(new CumulativeUpkeepAbility(new ManaCostsImpl<>("{G}")));
    }

    protected SplinterToken(final SplinterToken token) {
        super(token);
    }

    public SplinterToken copy() {
        return new SplinterToken(this);
    }
}
