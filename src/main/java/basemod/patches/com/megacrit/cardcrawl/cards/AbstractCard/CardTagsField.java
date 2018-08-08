package basemod.patches.com.megacrit.cardcrawl.cards.AbstractCard;

import com.evacipated.cardcrawl.modthespire.lib.SpireField;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;

import java.util.HashSet;
import java.util.Set;

@SpirePatch(
		cls="com.megacrit.cardcrawl.cards.AbstractCard",
		method=SpirePatch.CLASS
)
public class CardTagsField
{
	public static SpireField<Set<String>> tags = new SpireField<>(HashSet::new);
}
