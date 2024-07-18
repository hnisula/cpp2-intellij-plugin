// This is a generated file. Not intended for manual editing.
package org.hannesnisula.cpp2plugin.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class Cpp2Visitor extends PsiElementVisitor {

  public void visitAssignment(@NotNull Cpp2Assignment o) {
    visitPsiElement(o);
  }

  public void visitExpression(@NotNull Cpp2Expression o) {
    visitPsiElement(o);
  }

  public void visitStatement(@NotNull Cpp2Statement o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
