
package mage.cards.a;

import java.util.UUID;
import mage.MageInt;
import mage.abilities.common.BlocksSourceTriggeredAbility;
import mage.abilities.common.delayed.AtTheEndOfCombatDelayedTriggeredAbility;
import mage.abilities.effects.Effect;
import mage.abilities.effects.common.CreateDelayedTriggeredAbilityEffect;
import mage.abilities.effects.common.ReturnToHandTargetEffect;
import mage.abilities.keyword.DefenderAbility;
import mage.abilities.keyword.ReachAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

/**
 *
 * @author klayhamn
 */
public final class AetherMembrane extends CardImpl {

    public AetherMembrane(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1}{R}{R}");
        this.subtype.add(SubType.WALL);
        this.power = new MageInt(0);
        this.toughness = new MageInt(5);

        // Defender
        this.addAbility(DefenderAbility.getInstance());

        // Reach
        this.addAbility(ReachAbility.getInstance());

        // Whenever Aether Membrane blocks a creature, return that creature to its owner's hand at end of combat.
        Effect effect = new ReturnToHandTargetEffect();
        effect.setText("return that creature to its owner's hand at end of combat");
        this.addAbility(new BlocksSourceTriggeredAbility(new CreateDelayedTriggeredAbilityEffect(new AtTheEndOfCombatDelayedTriggeredAbility(effect)), false, true));
    }

    public AetherMembrane(final AetherMembrane card) {
        super(card);
    }

    @Override
    public AetherMembrane copy() {
        return new AetherMembrane(this);
    }
}
