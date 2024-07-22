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

public class Cpp2VarDefinitionImpl extends ASTWrapperPsiElement implements Cpp2VarDefinition {

  public Cpp2VarDefinitionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Cpp2Visitor visitor) {
    visitor.visitVarDefinition(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Cpp2Visitor) accept((Cpp2Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public Cpp2Expression getExpression() {
    return findNotNullChildByClass(Cpp2Expression.class);
  }

  @Override
  @Nullable
  public Cpp2TypeSpecifier getTypeSpecifier() {
    return findChildByClass(Cpp2TypeSpecifier.class);
  }

}
