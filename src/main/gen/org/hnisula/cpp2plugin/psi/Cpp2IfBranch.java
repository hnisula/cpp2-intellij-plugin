// This is a generated file. Not intended for manual editing.
package org.hnisula.cpp2plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface Cpp2IfBranch extends PsiElement {

  @NotNull
  List<Cpp2Expr> getExprList();

  @NotNull
  List<Cpp2StmtBlock> getStmtBlockList();

  //WARNING: getContext(...) is skipped
  //matching getContext(Cpp2IfBranch, ...)
  //methods are not found in Cpp2PsiUtil

}
