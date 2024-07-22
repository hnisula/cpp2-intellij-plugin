// This is a generated file. Not intended for manual editing.
package org.hannesnisula.cpp2plugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.hannesnisula.cpp2plugin.psi.Cpp2Types.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.hannesnisula.cpp2plugin.psi.*;

public class Cpp2IdentifierImpl extends ASTWrapperPsiElement implements Cpp2Identifier {

  public Cpp2IdentifierImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Cpp2Visitor visitor) {
    visitor.visitIdentifier(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Cpp2Visitor) accept((Cpp2Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public Cpp2Expression getExpression() {
    return findChildByClass(Cpp2Expression.class);
  }

  @Override
  @Nullable
  public Cpp2TemplateDefinition getTemplateDefinition() {
    return findChildByClass(Cpp2TemplateDefinition.class);
  }

}
