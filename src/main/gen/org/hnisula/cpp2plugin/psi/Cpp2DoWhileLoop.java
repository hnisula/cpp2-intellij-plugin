// This is a generated file. Not intended for manual editing.
package org.hnisula.cpp2plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface Cpp2DoWhileLoop extends PsiElement {

  @NotNull
  Cpp2Expr getExpr();

  @Nullable
  Cpp2NextStmt getNextStmt();

  @NotNull
  Cpp2StmtBlock getStmtBlock();

  //WARNING: getContext(...) is skipped
  //matching getContext(Cpp2DoWhileLoop, ...)
  //methods are not found in Cpp2PsiUtil

}
