// This is a generated file. Not intended for manual editing.
package org.hannesnisula.cpp2plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface Cpp2FuncExpr extends Cpp2Expr {

  @NotNull
  Cpp2FuncSignature getFuncSignature();

  @Nullable
  Cpp2Stmt getStmt();

  @Nullable
  Cpp2StmtBlock getStmtBlock();

}
