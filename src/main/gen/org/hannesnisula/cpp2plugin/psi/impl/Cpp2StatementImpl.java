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

public class Cpp2StatementImpl extends ASTWrapperPsiElement implements Cpp2Statement {

  public Cpp2StatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Cpp2Visitor visitor) {
    visitor.visitStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Cpp2Visitor) accept((Cpp2Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public Cpp2Expr getExpr() {
    return findChildByClass(Cpp2Expr.class);
  }

  @Override
  @Nullable
  public Cpp2VarAssign getVarAssign() {
    return findChildByClass(Cpp2VarAssign.class);
  }

  @Override
  @Nullable
  public Cpp2VarDecl getVarDecl() {
    return findChildByClass(Cpp2VarDecl.class);
  }

  @Override
  @Nullable
  public Cpp2VarDef getVarDef() {
    return findChildByClass(Cpp2VarDef.class);
  }

}
